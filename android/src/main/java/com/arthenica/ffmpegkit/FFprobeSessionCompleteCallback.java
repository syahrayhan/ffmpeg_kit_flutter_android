package com.arthenica.ffmpegkit;

/**
 * <p>Callback function that is invoked when an asynchronous <code>FFprobe</code> session has ended.
 */
@FunctionalInterface
public interface FFprobeSessionCompleteCallback {

    /**
     * <p>Called when an FFprobe session has ended.
     *
     * @param session FFprobe session
     */
    void apply(final com.arthenica.ffmpegkit.FFprobeSession session);

}
