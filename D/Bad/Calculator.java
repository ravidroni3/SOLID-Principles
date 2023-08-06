package D.Bad;

public class Calculator {
    public int calculate(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a,b);
            case "sub":
                SubstractOperation substractOperation = new SubstractOperation();
                result = substractOperation.sub(a,b);
        }
        return result;
    }
}