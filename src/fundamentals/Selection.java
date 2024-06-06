package fundamentals;

public class Selection {

    public static void main(String[] args) {
        simpleIfExample();
        line();
        validationByGuardClause(-3);
        line();
        ifElseExample(true);
        line();
        ifElseIfExample();
        switchExample("Sunday");
        line();
        nestedIf(-100, true);
        System.out.println("-");
        nestedIf(-100, false);
    }

    private static void line() {
        System.out.println("=========");
    }

    private static void simpleIfExample() {
        int amount = 20;
        System.out.println("Step 1");
        if (amount > 10) {
            System.out.println("Wow! Amount more than 10");
        }
        System.out.println("Step 2");
        System.out.println("Step 3");
    }

    private static void validationByGuardClause(int amount) {
        if (amount < 0) {
            System.out.println("This is negative number cannot proceed");
            return;
        }
        System.out.println("Accept amount: " + amount);
    }

    // Take a walk condition
    private static void ifElseExample(boolean isColdOutside) {
        // Tank Top - Hot, Sweater - Cold
        String shirt;
        if (isColdOutside) {
            shirt = "Sweater";
        } else {
            shirt = "Tank Top";
        }
        System.out.println(STR."I need to wear \{shirt} to go outside");
    }

    // Traffic light example - RED, YELLOW, GREEN, BLANK
    private static void ifElseIfExample() {
        int speed = 40;
        String light = "BLANK";
        if (light.equals("RED")) {
            speed = 0;
            System.out.println(STR."Current speed: \{speed}");
        } else if (light.equals("YELLOW")) {
            speed = 20;
            System.out.println(STR."Current speed: \{speed}");
        } else if (light.equals("GREEN")) {
            speed += 2;
            System.out.println(STR."Current speed: \{speed}");
        }
        // BLANK will do nothing here
        // We will end with "else" condition if and only if we have another computation to do separate
    }

    // Weekday or Weekend or N/A
    private static void switchExample(String day) {
        oldSwitch1(day);
        oldSwitch2(day);
        newSwitchExpression1(day);
        newSwitchExpression2(day);
        newSwitchYieldStatement(day);
    }

    private static void oldSwitch1(String day) {
        String result;
        // Put value that you need to check
        switch (day) {
            case "Monday":
                result = "Weekday";
                break;
            case "Tuesday":
                result = "Weekday";
                break;
            case "Wednesday":
                result = "Weekday";
                break;
            case "Thursday":
                result = "Weekday";
                break;
            case "Friday":
                result = "Weekday";
                break;
            case "Saturday":
                result = "Weekend";
                break;
            case "Sunday":
                result = "Weekend";
                break;
            default:
                result = "N/A";
                break;
        }
        System.out.println(STR."[oldSwitch1] Result: \{result}");
    }

    private static void oldSwitch2(String day) {
        String result;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                result = "Weekday";
                break;
            case "Saturday":
            case "Sunday":
                result = "Weekend";
                break;
            default:
                result = "N/A";
                break;
        }
        System.out.println(STR."[oldSwitch2] Result: \{result}");
    }

    private static void newSwitchExpression1(String day) {
        String result;
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                result = "Weekday";
                break;
            case "Saturday", "Sunday":
                result = "Weekend";
                break;
            default:
                result = "N/A";
                break;
        }
        System.out.println(STR."[newSwitchExpression1] Result: \{result}");
    }

    private static void newSwitchExpression2(String day) {
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "N/A";
        };
        System.out.println(STR."[newSwitchExpression2] Result: \{result}");
    }

    // Yield - providing more computation block
    private static void newSwitchYieldStatement(String day) {
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                System.out.println("Oh! we got weekday");
                yield "Weekday";
            }
            case "Saturday", "Sunday" -> {
                System.out.println("Oh! we can sleep on weekend");
                yield "Weekend";
            }
            default -> {
                System.out.println("What kind of day?!");
                yield "N/A";
            }
        };
        System.out.println(STR."[newSwitchYieldStatement] Result: \{result}");
    }

    // Validate Input - log example
    private static void nestedIf(int amount, boolean isEnabledEmergency) {
        if (amount < 0) {
            System.out.println(STR."We received negative amount: \{amount}");
            // If emergency enable - we will contact support
            if (isEnabledEmergency) {
                System.out.println("Contact to support with topic: Received negative amount on system");
            }
        }
        System.out.println("Success on nestedIf");
    }

}
