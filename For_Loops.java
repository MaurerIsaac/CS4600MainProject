import java.util.List;
import java.util.ArrayList;

interface Expression {
    void accept(ASTVisitor visitor);
}

interface Statement {
    void accept(ASTVisitor visitor);
}

class BlockStatement implements Statement {
    private final List<Statement> statements;

    public BlockStatement(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class ForLoopStatement implements Statement {
    private final Statement initialization;

    private final Expression condition;

    private final Statement update;

    private final List<Statement> body;

    public ForLoopStatement(Statement initialization, Expression condition, Statement update, List<Statement> body) {
        this.initialization = initialization;
        this.condition = condition;
        this.update = update;
        this.body = body;
    }

    public Statement getInitialization() { return initialization; }
    public Expression getCondition() { return condition; }
    public Statement getUpdate() { return update; }
    public List<Statement> getBody() { return body; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class IfStatement implements Statement {
    private final Expression condition;
    private final List<Statement> thenBody;

    private final Statement elseStatement;

    public IfStatement(Expression condition, List<Statement> thenBody, Statement elseStatement) {
        this.condition = condition;
        this.thenBody = thenBody;
        this.elseStatement = elseStatement;
    }

    public Expression getCondition() { return condition; }
    public List<Statement> getThenBody() { return thenBody; }
    public Statement getElseStatement() { return elseStatement; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class AssignmentStatement implements Statement {
    private final String variableName;
    private final Expression expression;

    public AssignmentStatement(String variableName, Expression expression) {
        this.variableName = variableName;
        this.expression = expression;
    }

    public String getVariableName() { return variableName; }
    public Expression getExpression() { return expression; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class PrintStatement implements Statement {
    private final Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() { return expression; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class IntegerLiteral implements Expression {
    private final int value;

    public IntegerLiteral(int value) {
        this.value = value;
    }

    public int getValue() { return value; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class LessThanExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public LessThanExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() { return left; }
    public Expression getRight() { return right; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}

class VariableReference implements Expression {
    private final String variableName;

    public VariableReference(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableName() { return variableName; }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}


interface ASTVisitor {
    void visit(ForLoopStatement statement);
    void visit(IfStatement statement);
    void visit(BlockStatement statement);
    void visit(AssignmentStatement statement);
    void visit(PrintStatement statement);
    void visit(IntegerLiteral expression);
    void visit(LessThanExpression expression);
    void visit(VariableReference expression);
}

class ASTPrinterVisitor implements ASTVisitor {
    private final String indent = "  ";

    public void print(Statement root) {
        root.accept(this);
    }

    @Override
    public void visit(ForLoopStatement s) {
        System.out.println("FOR Loop:");
        System.out.print(indent + "Init: ");
        s.getInitialization().accept(this);

        System.out.print(indent + "Cond: ");
        s.getCondition().accept(this);

        System.out.print(indent + "Update: ");
        s.getUpdate().accept(this);

        System.out.println(indent + "Body (Start):");
        for (Statement bodyStmt : s.getBody()) {
            System.out.print(indent + indent);
            bodyStmt.accept(new ASTPrinterVisitor());
        }
        System.out.println(indent + "Body (End)");
    }

    @Override
    public void visit(IfStatement s) {
        System.out.print("IF (");
        s.getCondition().accept(this);
        System.out.println(")");
        System.out.println(indent + "THEN (Start):");
        for (Statement bodyStmt : s.getThenBody()) {
            System.out.print(indent + indent);
            bodyStmt.accept(new ASTPrinterVisitor());
        }
        System.out.println(indent + "THEN (End)");

        if (s.getElseStatement() != null) {
            System.out.print(indent + "ELSE: ");
            if (s.getElseStatement() instanceof IfStatement) {
                s.getElseStatement().accept(this);
            } else {
                System.out.println("(Start)");
                s.getElseStatement().accept(this);
            }
        }
    }

    @Override
    public void visit(BlockStatement s) {
        for (Statement stmt : s.getStatements()) {
            System.out.print(indent + indent + indent);
            stmt.accept(new ASTPrinterVisitor());
        }
    }

    @Override
    public void visit(AssignmentStatement s) {
        System.out.print("ASSIGN variable '" + s.getVariableName() + "' = ");
        s.getExpression().accept(this);
        System.out.println();
    }

    @Override
    public void visit(PrintStatement s) {
        System.out.print("PRINT(");
        s.getExpression().accept(this);
        System.out.println(")");
    }

    @Override
    public void visit(IntegerLiteral e) {
        System.out.print("INT_LITERAL(" + e.getValue() + ")");
    }

    @Override
    public void visit(LessThanExpression e) {
        System.out.print("LESS_THAN(");
        e.getLeft().accept(this);
        System.out.print(", ");
        e.getRight().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(VariableReference e) {
        System.out.print("VAR_REF('" + e.getVariableName() + "')");
    }
}

public class ForLoopAST {
    public static void main(String[] args) {

        Statement init = new AssignmentStatement(
            "i",
            new IntegerLiteral(0)
        );

        Expression condition = new LessThanExpression(
            new VariableReference("i"),
            new IntegerLiteral(5)
        );

        Statement update = new AssignmentStatement(
            "i",
            new IntegerLiteral(5)
        );


        List<Statement> forBody = new ArrayList<>();
        forBody.add(new PrintStatement(
            new VariableReference("i")
        ));

        ForLoopStatement forLoop = new ForLoopStatement(init, condition, update, forBody);


        List<Statement> elseStatements = new ArrayList<>();
        elseStatements.add(new PrintStatement(new IntegerLiteral(3)));
        BlockStatement elseBlock = new BlockStatement(elseStatements);

        List<Statement> elseIfBody = new ArrayList<>();
        elseIfBody.add(new PrintStatement(new IntegerLiteral(2)));
        IfStatement elseIf = new IfStatement(
            new LessThanExpression(new VariableReference("i"), new IntegerLiteral(4)),
            elseIfBody,
            elseBlock
        );

        List<Statement> ifBody = new ArrayList<>();
        ifBody.add(new PrintStatement(new IntegerLiteral(1)));
        IfStatement ifElseIfElse = new IfStatement(
            new LessThanExpression(new VariableReference("i"), new IntegerLiteral(2)),
            ifBody,
            elseIf
        );


        System.out.println("--- Generating AST Structure for FOR Loop ---");
        ASTPrinterVisitor visitor = new ASTPrinterVisitor();
        visitor.print(forLoop);
        System.out.println("-------------------------------------------");

        System.out.println("\n--- Generating AST Structure for IF/ELSE/IF ---");
        visitor.print(ifElseIfElse);
        System.out.println("---------------------------------------------");
    }
}
