package chapter1;

// ������� ������ �ܾ� ��Ͽ��� ���� �ܾ� �ϳ��� �������� �����Ͽ� ������ ����ϴ� ���α׷�
public class PharseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"24/7", "multi-Tire", "30,000 foot", "B-to-B", "win-win", "front-end", "web-base"};
        String[] wordListTwo = {"empowered", "sticky", "oriented", "centric", "distributed", "sugar","shared","aligned","dynamin"};
        String[] wordListThree = {"process", "space", "portal","mission","strategy"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String pharse = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

        System.out.println("What we need is a "+pharse);
    }
}
