package epdfinal2324;

import java.util.Comparator;

public class AtletaComparatorEdad implements Comparator<Atleta>{

    @Override
    public int compare(Atleta o1, Atleta o2) {
        return o1.getEdad() - o2.getEdad();
    }

}
