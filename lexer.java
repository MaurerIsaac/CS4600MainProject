import java.util.*;

public class Lexer{
    public enum TokenType {
        // Keywords
        ASSIGN, IF, ELSE, WHILE, FOR, BREAK, CONTINUE, FUNCTION, RETURN, PRINT,
        INT, FLOAT, STRUCT, AND, OR, NOT,

        // Symbols
        LPAREN, RPAREN, LBRACE, RBRACE, LBRACKET, RBRACKET,
        COMMA, SEMI, PLUS, MINUS, STAR, SLASH, MOD,
        LT, LE, GT, GE, EQEQ, NEQ, ASSIGN_OP,

        // Literals
        ID, INT_LIT, FLOAT_LIT,

        EOF
    }
    public static class Token {
        public final TokenType type;
        public final String lexeme;

        public Token(TokenType type, String lexeme) {
            this.type = type;
            this.lexeme = lexeme;
        }

        @Override
        public String toString() {
            return String.format("Token(type=%s, lexeme='%s')", type, lexeme);
        }
    }
    private final String input;
    private int pos = 0;
    private final int length;
    public Lexer(String input) {
        this.input = input;
        this.length = input.length();
    }
    private char peek() {
        if (pos >= length) return '\0';
        return input.charAt(pos);}
    private char next() {
        if (pos >= length) return '\0';
        return input.charAt(pos++);}
    public Token nextToken() {
        while (Character.isWhitespace(peek())) {
            next();
        }
        char current = peek();
        if (current == '\0') {
            return new Token(TokenType.EOF, "");
        }
        if (Character.isLetter(current) || current == '_') {
            StringBuilder sb = new StringBuilder();
            while (Character.isLetterOrDigit(peek()) || peek() == '_') {
                sb.append(next());
            }
            String lexeme = sb.toString();
            switch (lexeme) {
                case "if": return new Token(TokenType.IF, lexeme);
                case "else": return new Token(TokenType.ELSE, lexeme);
                case "while": return new Token(TokenType.WHILE, lexeme);
                case "for": return new Token(TokenType.FOR, lexeme);
                case "break": return new Token(TokenType.BREAK, lexeme);
                case "continue": return new Token(TokenType.CONTINUE, lexeme);
                case "function": return new Token(TokenType.FUNCTION, lexeme);
                case "return": return new Token(TokenType.RETURN, lexeme);
                case "print": return new Token(TokenType.PRINT, lexeme);
                case "int": return new Token(TokenType.INT, lexeme);
                case "float": return new Token(TokenType.FLOAT, lexeme);
                case "struct": return new Token(TokenType.STRUCT, lexeme);
                case "and": return new Token(TokenType.AND, lexeme);
                case "or": return new Token(TokenType.OR, lexeme);
                case "not": return new Token(TokenType.NOT, lexeme);
                default: return new Token(TokenType.ID, lexeme);
            }
        }
        if (Character.isDigit(current)) {
            StringBuilder sb = new StringBuilder();
            boolean isFloat = false;
            while (Character.isDigit(peek())) {
                sb.append(next());
            }
            if (peek() == '.') {
                isFloat = true;
                sb.append(next());
                while (Character.isDigit(peek())) {
                    sb.append(next());
                }
            }
            String lexeme = sb.toString();
            if (isFloat) {
                return new Token(TokenType.FLOAT_LIT, lexeme);
            } else {
                return new Token(TokenType.INT_LIT, lexeme);
            }
        }
        switch (current) {
            case '(': next(); return new Token(TokenType.LPAREN, "(");
            case ')': next(); return new Token(TokenType.RPAREN, ")");
            case '{': next(); return new Token(TokenType.LBRACE, "{");
            case '}': next(); return new Token(TokenType.RBRACE, "}");
            case '[': next(); return new Token(TokenType.LBRACKET, "[");
            case ']': next(); return new Token(TokenType.RBRACKET, "]");
            case ',': next(); return new Token(TokenType.COMMA, ",");
            case ';': next(); return new Token(TokenType.SEMI, ";");
            case '+': next(); return new Token(TokenType.PLUS, "+");
            case '-': next(); return new Token(TokenType.MINUS, "-");
            case '*': next(); return new Token(TokenType.STAR, "*");
            case '/': next(); return new Token(TokenType.SLASH, "/");
            case '%': next(); return new Token(TokenType.MOD, "%");
            case '<':
                next();
                if (peek() == '=') {
                    next();
                    return new Token(TokenType.LE, "<=");
                }
                return new Token(TokenType.LT, "<");
            case '>':
                next();
                if (peek() == '=') {
                    next();
                    return new Token(TokenType.GE, ">=");
                }
                return new Token(TokenType.GT, ">");
            case '=':
                next();
                if (peek() == '=') {
                    next();
                    return new Token(TokenType.EQEQ, "==");
                }
                return new Token(TokenType.ASSIGN_OP, "=");
            case '!':
                next();
                if (peek() == '=') {
                    next();
                    return new Token(TokenType.NEQ, "!=");
                }
                return new Token(TokenType.NOT, "!");
        }
        // Unknown character: skip it and continue scanning
        next();
        return nextToken();
    }
    public static void main(String[] args) {
        String code = "function add(int a, int b) { return a + b; }";
        Lexer lexer = new Lexer(code);
        Token token;
        do {
            token = lexer.nextToken();
            System.out.println(token);
        } while (token.type != TokenType.EOF);}
}
