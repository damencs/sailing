package com.duckblade.osrs.sailing.features.util;

import javax.inject.Inject;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Client;
import net.runelite.api.gameval.VarbitID;

@RequiredArgsConstructor(onConstructor_ = @Inject)
public class SailingUtil
{

	public static final int WORLD_ENTITY_TYPE_BOAT = 2;
	public static final int ACCOUNT_TYPE_UIM = 2;

	public static boolean isSailing(Client client)
	{
		return client.getLocalPlayer() != null &&
			!client.getLocalPlayer().getWorldView().isTopLevel();
	}

	public static boolean isUim(Client client)
	{
		return client.getVarbitValue(VarbitID.IRONMAN) == ACCOUNT_TYPE_UIM;
	}

}
