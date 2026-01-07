(
~task = EvoLab.play(
    [Midis],
    [day: 10, night: 10
	],
    inf
);
)



(
Server.default.options.device = "ASIO : BEHRINGER USB AUDIO";
Server.default.options.sampleRate = 44100;
Server.default.options.hardwareBufferSize = 256;
Server.default.reboot;
)