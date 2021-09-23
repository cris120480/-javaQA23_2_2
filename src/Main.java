public class Main {

    public static void main(String[] args) {

        float balanceNow = 100.00F;
        float transactionNew = 1955.00F;

        if (transactionNew > 1000) {
           transactionNew =  transactionNew + (int) transactionNew / 100;

      }
        float totalBalance = balanceNow +  transactionNew;
           System.out.println(totalBalance);
    }
    }



