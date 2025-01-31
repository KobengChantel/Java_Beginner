public class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal1 a) {
        return a.canHop();
    }
}
