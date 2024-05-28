package ex03;

import ex03.lib.OuterCat;

public class CatAdapter extends Animal {

    private OuterCat outerCat;

    public CatAdapter(OuterCat outerCat) {
        this.outerCat = outerCat;
    }

    @Override
    public String getName() {
        return outerCat.getFullname();
    }
}
