package designpattern.structural.adapter;

import java.util.Scanner;

// The adapter design pattern is a structural design pattern that
// allows two unrelated/uncommon interfaces to work together.
// In other words, the adapter pattern makes two incompatible interfaces
// compatible without changing their existing code.
public class AdapterClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int returnFlag = 1;

        System.out.println("This is adapter pattern POC");
        System.out.println("Please select the provide to create VDC");
        System.out.println("Press 1: Amazon Cloud\tPress 2: Azure Cloud\tPress 3: Google Cloud");
        int vdcType = scan.nextInt();

        ClientBrokerInterface cbi;
        switch (vdcType){
            case 1:
                cbi = new AmazonCloudAdapter();
                break;
            case 2:
                cbi = new AzureCloudAdapter();
                break;
            case 3:
                cbi = new GoogleCloudAdapter();
            default:
                cbi = new AmazonCloudAdapter();
        }

        while(returnFlag == 1){
            System.out.println("Press 1: Start\tPress 2: Stop\tPress 3: Restart");
            int taskType = scan.nextInt();

            switch (taskType){
                case 1:
                    cbi.start(""); break;
                case 2:
                    cbi.stop(""); break;
                case 3:
                    cbi.restart(""); break;
            }

            System.out.println("Want to continue ? 1: Yes / 2: No");
            try{
                returnFlag = scan.nextInt();
            }catch (Exception e){

            }
        }
    }
}
