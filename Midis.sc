Midis : Creature {

    day {
        this.substitute({
            |gate = 1|
            var body, soul, env, sig;

            body = PlayBuf.ar(1, buffer, BufRateScale.kr(buffer) * 1, loop: 1);

            soul = SinOsc.ar(300);

            env = EnvGen.kr(Env.asr(0.1, 1, 1), gate, doneAction: 2);

            sig = (body * soul) * env;
            sig.dup;
        }.play);
    }

    night {
        this.substitute({
            |gate = 1|
            var body, soul, env, sig;

            body = PlayBuf.ar(1, buffer, BufRateScale.kr(buffer) * 0.5, loop: 1);

            soul = SinOsc.ar(100);

            env = EnvGen.kr(Env.asr(2, 1, 2), gate, doneAction: 2);

            sig = (body * soul) * env;
            sig.dup;
        }.play);
    }
}
