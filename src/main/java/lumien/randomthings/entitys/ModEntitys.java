package lumien.randomthings.entitys;

import lumien.randomthings.RandomThings;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys
{
	public static void init()
	{
		EntityRegistry.registerModEntity(EntitySoul.class, "playerSoul", 0, RandomThings.instance, 80, 1, true);
		EntityRegistry.registerModEntity(EntityReviveCircle.class, "reviveCircle", 1, RandomThings.instance, 80, 1, true);
	}
}