import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

class RMS {
    public static void main(String[] args) {
        CustomerDataSets cd = new CustomerDataSets();
        cd.basicDetails();
        cd.printCustomerDetails();
    }
}

class CustomerDataSets {
    Scanner i1 = new Scanner(System.in);
    Scanner i2 = new Scanner(System.in);
    int n = adminView();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
    int totalCollection = 0, i = 0;
    int[] id, timeSlot, orderAmount;
    int[][] tableNumber;
    int id0 = 100;
    String[] name, phone, orderDetails, date;

    void basicDetails() {
        int i = 0, opt = 0, hrNw;
        String hourNow;
        id = new int[84];
        name = new String[84];
        phone = new String[84];
        orderDetails = new String[10];
        date = new String[84];
        tableNumber = new int[12][7];
        timeSlot = new int[12];
        orderAmount = new int[84];
        System.out.println("\t\t\tWelcome to our resturent\n1)I want to eat now\n2)I want to schedule a time to dine");
        System.out.println("Enter your choice : ");
        opt = i1.nextInt();
        if (opt == 1) {
            LocalDateTime now = LocalDateTime.now();
            hourNow = dtf.format(now);
            hrNw = Integer.parseInt(hourNow);
            if (hrNw < 11 || hrNw > 23)
                System.out.println("Resturent is closed now !!!");
            else {
                prDet1();
            }
        } else if (opt == 2) {
            prDet2();
        } else
            System.out.println("Invalid input");
    }

    void menu() {
        int c = 0, opt = 10, x = 0;
        System.out.println("\t\t\t MENU \t\t\t");
        System.out.println("1) Chicken Biriyani ~ 165/-");
        System.out.println("2) Veg Biriyani ~ 140/-");
        System.out.println("3) Chicken kassa ~ 110/-");
        System.out.println("4) Chicken Handi ~ 175/-");
        System.out.println("5) Chicken dihati ~ 190/-");
        System.out.println("6) Tandori Roti x3 ~ 27/-");
        System.out.println("7) Jeera Rice ~ 85/-");
        System.out.println("8) Fried Rice ~ 115/-");
        System.out.println("9) Panner butter masala ~ 120/-");
        System.out.println("10) Chana Masala ~ 125/-");
        System.out.println("0) Ok,that's all for me");
        System.out.println("Sure mam,what would you like to have ?");
        orderAmount[i] = 0;
        while (opt != 0) {
            System.out.println("I want to have ...");
            opt = i1.nextInt();
            if (opt == 1) {
                totalCollection += 165;
                x = x + 165;
            } else if (opt == 2) {
                totalCollection += 140;
                x = x + 140;
            } else if (opt == 3) {
                totalCollection += 110;
                x = x + 110;
            } else if (opt == 4) {
                totalCollection += 175;
                x = x + 175;
            } else if (opt == 5) {
                totalCollection += 190;
                x = x + 190;
            } else if (opt == 6) {
                totalCollection += 27;
                x = x + 27;
            } else if (opt == 7) {
                totalCollection += 85;
                x = x + 85;
            } else if (opt == 8) {
                totalCollection += 115;
                x = x + 115;
            } else if (opt == 9) {
                totalCollection += 120;
                x = x + 120;
            } else if (opt == 10) {
                totalCollection += 125;
                x = x + 125;
            }
        }
        orderAmount[c] = x;
    }

    void prDet1() {
        for (int c = 0; c < n; c++) {
            System.out.println("Mam,please tell me your name ");
            name[c] = i2.next();
            System.out.println("Your phone number ?");
            phone[c] = i2.next();
            menu();
        }
    }

    void prDet2() {
        for (int c = 0; c < n; c++) {
            System.out.println("Sir,please tell me your name ");
            name[c] = i2.next();
            System.out.println("Your phone number ?");
            phone[c] = i2.next();
            System.out.println("Which date are you looking to have a slot ?");
            date[c] = i2.next();
            System.out.println("\t\t\t These are our available time slots \t\t\t");
            System.out.println("11) 11-12");
            System.out.println("12) 12-13");
            System.out.println("13) 13-14");
            System.out.println("14) 14-15");
            System.out.println("15) 15-16");
            System.out.println("16) 16-17");
            System.out.println("17) 17-18");
            System.out.println("18) 18-19");
            System.out.println("19) 19-20");
            System.out.println("20) 20-21");
            System.out.println("21) 21-22");
            System.out.println("22) 22-23");
            System.out.println("When would you like to book your slot ?");
            timeSlot[c] = i1.nextInt();
            int hehe = timeSlot[c];
            if (timeSlot[c] < 11 || timeSlot[c] > 23)
                System.out.println("We are not open in those times !!!");
            else {
                int hue = 0;
                menu();
            }
        }
    }

    void printCustomerDetails() {
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        id[0] = 101;
        for (int j = 0; j < n; j++) {
            System.out.println("\t\t\t Bill Of Customer ID - " + id[j]);
            System.out.println("Name : " + name[j]);
            System.out.println("Phone : " + phone[j]);
            System.out.print("Booked : " + dtf1.format(now));
            System.out.println("\n\t\t\t Please visit again \t\t\t");
            id[j + 1] = id[j] + 1;
        }
        System.out.println("\t\t\t Today's winner");
        giftGiving();
        basicDetails();
    }

    void giftGiving() {
        int key = orderAmount[0], index = 0;
        for (int gg = 0; i < 84; i++) {
            if (key < orderAmount[gg + 1]) {
                key = orderAmount[gg + 1];
                index++;
            }
        }
        System.out.println(name[index] + " would be getting our special gift hamper");
    }

    int adminView() {
        int numOfCus;
        System.out.println("Hey admin,how many customers are on queue");
        numOfCus = i1.nextInt();
        return numOfCus;
    }
}
