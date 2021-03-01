package Chapter02;

class DrumKit{
    boolean topHat = true;
    boolean snare = true;

    void playToHat(){
        System.out.println("ding ding da-ding");
    }
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.playToHat();
    }
}
