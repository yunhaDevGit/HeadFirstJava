package Chapter02;

class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("��ȭ�� ���մϴ�");
    }
}

public class MovieTestDrive{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "�ֽİ� �Բ� �������";
        one.genre = "���";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "�ν�Ʈ �� ť��Ŭ �����̽�";
        two.genre = "�ڹ̵�";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "����Ʈ Ŭ��";
        three.genre = "��� �������� ���";
        three.rating = 127;

    }
}
