// Copyright (c) Brandon Pacewic
// SPDX-License-Identifier: MIT

package org.firstinspires.ftc.teamcode.common.drive.trajectory.sequenceSegment

import com.acmerobotics.roadrunner.geometry.Pose2d
import com.acmerobotics.roadrunner.trajectory.TrajectoryMarker

/**
 * Adapted from the Roadrunner quickstart
 */
abstract class SequenceSegment(
    private var duration: Double?,
    private var startPose: Pose2d?, 
    private var endPose: Pose2d?, 
    private var markers: MutableList<TrajectoryMarker>?
) {

    fun getDuration(): Double? {
        return duration
    }

    fun getStartPose(): Pose2d? {
        return startPose
    }

    fun getEndPose(): Pose2d? {
        return endPose
    }

    fun getMarkers(): MutableList<TrajectoryMarker>? {
        return markers
    }
}