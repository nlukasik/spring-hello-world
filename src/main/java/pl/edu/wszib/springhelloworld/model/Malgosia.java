package pl.edu.wszib.springhelloworld.model;

public class Malgosia extends Dziecko {

    public Malgosia(Zabawka zabawka) {
        super(zabawka);
    }

    @Override
    public void odpakuj() {
        if(!(zabawka instanceof Mis)) {
            throw new RuntimeException("Chciałam Misia");
        }
    }

}
