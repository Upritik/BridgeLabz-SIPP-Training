import java.util.*;
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378.0; 
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 * 0.239006;

        System.out.println(volumeKm3);
        System.out.println(volumeMiles3);
    }
}
