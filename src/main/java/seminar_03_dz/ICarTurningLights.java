package seminar_03_dz;

public interface ICarTurningLights {
    public default void turningLights(Lights ligths){
        System.out.println("Включены фары " + ligths);
    }
}
