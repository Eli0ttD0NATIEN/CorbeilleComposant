package jpu2016.dogfight.view;
import java.lang.Runnable;

abstract class DogfightView implements IViewSystem {
    public DogfightView(IOrderPerformer orderPerformer, IDogFightModel dogFightModel, Observable observable) {

    }

    @Override
    public void closeAll() {
    }

    public void diplayMessage(String message) {
    }

    private void run() {
    }

}
