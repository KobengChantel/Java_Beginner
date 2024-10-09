package Book3.chapter5;
// ThrowableBal

    public interface PlayableBall
            extends ThrowableBall, KickableBall {
        void dropBall();
    }
