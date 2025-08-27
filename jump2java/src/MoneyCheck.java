import java.util.ArrayList;


public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("crd");
        pocket.add("1000");

        if (pocket.contains("card")) {
            System.out.println("카드가 있어서 택시를 타고 가라");
        } else if (Integer.parseInt(pocket.get(2)) >= 3000) {
            System.out.println("현금이 있어서 택시를 타고 가라");
        }else {
            System.out.println(String.format("%s원 밖에 없으니 아무것도 없으니 걸어가라",pocket.get(2)));
        }
        }
    }
