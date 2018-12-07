package com.tanggongwen.simpleaudioplayer.listener;

public interface OnAudioPlayListener {
    void onAudioPlayReady(int duration);

    void onAudioPlaying(int current, int duration);

    void onAudioPlayEnd();

    void OnAudioPlayError();
}
