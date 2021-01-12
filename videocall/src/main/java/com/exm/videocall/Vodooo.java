package com.exm.videocall;

import android.content.Context;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.EglBase;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

import io.socket.client.Socket;

public class Vodooo {
    private static final String TAG = "CompleteActivity";
    private static final int RC_CALL = 111;
    public static final String VIDEO_TRACK_ID = "ARDAMSv0";
    public static final int VIDEO_RESOLUTION_WIDTH = 1280;
    public static final int VIDEO_RESOLUTION_HEIGHT = 720;
    public static final int FPS = 30;
    private Socket socket;
    MediaConstraints audioConstraints;
    private boolean isInitiator;
    private boolean isChannelReady;
    private boolean isStarted;
    private PeerConnection peerConnection;
    private AppRTCAudioManager audioManager;
    AudioSource audioSource;
    AudioTrack localAudioTrack;
    private EglBase rootEglBase;
    VideoCapturer videoCapturer;
    VideoSource videoSource;
    MediaStream mediaStream;
    private SurfaceViewRenderer surface_view1;
    private SurfaceViewRenderer surface_view2;
    private PeerConnectionFactory factory;
    private VideoTrack videoTrackFromCamera;
    private Context context;


}
