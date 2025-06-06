/*
 * Copyright (c) 2018-2021 Taner Sener
 *
 * This file is part of FFmpegKit.
 *
 * FFmpegKit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FFmpegKit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with FFmpegKit.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.arthenica.ffmpegkit;

/**
 * <p>Callback function that is invoked when an asynchronous <code>MediaInformation</code> session
 * has ended.
 */
@FunctionalInterface
public interface MediaInformationSessionCompleteCallback {

    /**
     * <p>Called when a media information session has ended.
     *
     * @param session media information session
     */
    void apply(final com.arthenica.ffmpegkit.MediaInformationSession session);

}
