package v3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        InputOutputManage iomanage = new InputOutputManage(scanner, storage);

        iomanage.startCalculator();

    }

}
