package pl.edu.wszib.springhelloworld.model;

public class Zawieszenie {

    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow ;
    private UkladSterowania ukladSterowania ;

    public Zawieszenie(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania) {
        this.silnik = silnik;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.ukladSterowania = ukladSterowania;
    }
}
