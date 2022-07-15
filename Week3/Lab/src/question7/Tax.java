package question7;

public class Tax {
    public static double single(double income) {
        if(income <= 9950) {
            return (9950 * 10)/100;
        } else if(income > 9950 && income <= 40525) {
            return (income * 12)/100 + 995;
        } else if(income > 40525 && income <= 86375) {
            return (income * 22)/100 + 4664;
        } else if(income > 86375 && income <= 164925) {
            return (income * 24)/100 + 14751;
        } else if(income > 164925 && income <= 209425) {
            return (income * 32)/100 + 33603;
        } else if(income > 209425 && income <= 523600) {
            return (income * 35)/100 + 47843;
        } else {
            return (income * 37)/100 + 157804.25;
        }
    }
    public static double marriedJoint(double income) {
        if(income <= 19900) {
            return (19900 * 10)/100;
        } else if(income > 19900 && income <= 81050) {
            return (income * 12)/100 + 1990;
        } else if(income > 81050 && income <= 172750) {
            return (income * 22)/100 + 9328;
        } else if(income > 172750 && income <= 329850) {
            return (income * 24)/100 + 29502;
        } else if(income > 329850 && income <= 418850) {
            return (income * 32)/100 + 67206;
        } else if(income > 418850 && income <= 628300) {
            return (income * 35)/100 + 95686;
        } else {
            return (income * 37)/100 + 168993.5;
        }
    }

    public static double married(double income) {
        if(income <= 9950) {
            return (9950 * 10)/100;
        } else if(income > 9950 && income <= 40525) {
            return (income * 12)/100 + 995;
        } else if(income > 40525 && income <= 86375) {
            return (income * 22)/100 + 4664;
        } else if(income > 86375 && income <= 164925) {
            return (income * 24)/100 + 14751;
        } else if(income > 164925 && income <= 209425) {
            return (income * 32)/100 + 33603;
        } else if(income > 209425 && income <= 314150) {
            return (income * 35)/100 + 47843;
        } else {
            return (income * 37)/100 + 84496;
        }
    }

    public static double headOf(double income) {
        if(income <= 14200) {
            return (14200 * 10)/100;
        } else if(income > 14200 && income <= 54200) {
            return (income * 12)/100 + 1420;
        } else if(income > 54200 && income <= 86350) {
            return (income * 22)/100 + 6220;
        } else if(income > 86350 && income <= 164900) {
            return (income * 24)/100 + 13293;
        } else if(income > 164900 && income <= 209400) {
            return (income * 32)/100 + 32145;
        } else if(income > 209400 && income <= 523600) {
            return (income * 35)/100 + 46385;
        } else {
            return (income * 37)/100 + 157804.25;
        }
    }
}
