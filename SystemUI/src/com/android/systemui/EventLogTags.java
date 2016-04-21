package com.android.systemui;

public class EventLogTags
{

	public static final int SYSUI_PANELBAR_TOUCH = 36010;

	public static final int SYSUI_FULLSCREEN_NOTIFICATION = 36002;

	public static final int SYSUI_HEADS_UP_ESCALATION = 36003;

	public static final int SYSUI_STATUSBAR_TOUCH = 36000;

	public static final int SYSUI_RECENTS_EVENT = 36070;

	public static final int SYSUI_PANELHOLDER_TOUCH = 36040;

	private static final int SYSUI_LOCKSCREEN_GESTURE = 36021;

	private static final int SYSUI_STATUS_BAR_STATE = 36004;
	
	private EventLogTags(){
		
	}
	
	public static void writeSysuiPanelbarTouch(int type, int x, int y, int enable)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_PANELBAR_TOUCH, type, x, y, enable);
	}
	
	public static void writeSysuiFullscreenNotification(int key)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_FULLSCREEN_NOTIFICATION, key);
	}
	
	public static void writeSysuiHeadsUpEscalation(int key)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_HEADS_UP_ESCALATION, key);
	}

	public static void writeSysuiStatusbarTouch(int type, int x, int y, int disable1, int disable2)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_STATUSBAR_TOUCH, type, x, y, disable1, disable2);
	}
	
	public static void writeSysuiRecentsEvent(int what)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_RECENTS_EVENT, what);
	}
	
	public static void writeSysuiPanelholderTouch(int type, int x, int y)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_PANELHOLDER_TOUCH, type, x, y);
	}

	public static void writeSysuiStatusBarState(int state, int isShowing, int isOccluded, int isBouncerShowing, int isSecure, int canSkipBouncer)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_STATUS_BAR_STATE, state, isShowing, isOccluded, isBouncerShowing, isSecure, canSkipBouncer);
	}

	public static void writeSysuiLockscreenGesture(int type, int lengthDp, int velocityDp)
	{
		// TODO: Implement this method
		android.util.EventLog.writeEvent(SYSUI_LOCKSCREEN_GESTURE, type, lengthDp, velocityDp);
	}
}
