package MuyCompleto;

import java.util.Objects;

public class SubObjetoCompareTo implements Comparable<SubObjetoCompareTo> {
    private String valorStringSub;
    private int numSub;

    public SubObjetoCompareTo(String valorStringSub, int numSub) {
        this.valorStringSub = valorStringSub;
        this.numSub = numSub;
    }

    public String getValorStringSub() {
        return valorStringSub;
    }

    public void setValorStringSub(String valorStringSub) {
        this.valorStringSub = valorStringSub;
    }

    public int getNumSub() {
        return numSub;
    }

    public void setNumSub(int numSub) {
        this.numSub = numSub;
    }

    @Override
    public String toString() {
        return "SO{" + "VSS='" + valorStringSub + '\'' + ", NS=" + numSub + '}';
    }


    //public int compareTo(SubObjeto so) {
    //    return (this.valorStringSub).compareTo(so.valorStringSub);
    //}

    public int compareTo(SubObjetoCompareTo g) {
        if (this.valorStringSub.equals(g.getValorStringSub())) {
            if(this.numSub == g.getNumSub()) {
                return 0;
            }
           return Integer.compare(this.numSub, g.getNumSub());
        }
        return this.valorStringSub.compareTo(g.getValorStringSub());
    }
/*
    public int compareTo(MuyCompleto.SubObjetoCompareTo c) {
        return this.valorStringSub.equals(c.getValorStringSub()) ? Integer.compare(this.numSub, c.getNumSub()): this.valorStringSub.compareTo(c.getValorStringSub());
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubObjetoCompareTo subObjeto = (SubObjetoCompareTo) o;
        return numSub == subObjeto.numSub && Objects.equals(valorStringSub, subObjeto.valorStringSub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorStringSub, numSub);
    }
}