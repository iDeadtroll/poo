package epdfinal2324;

import java.util.Comparator;

public class AtletaComparatorPaisEdad implements Comparator<Atleta>{

    @Override
    public int compare(Atleta o1, Atleta o2) {
        if (o1.getPais().compareTo(o2.getPais()) == 0){
            return o1.getEdad() - o2.getEdad();
        }else{
            return o1.getPais().compareTo(o2.getPais());
        }
    }

}
