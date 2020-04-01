package mce.lu.client.core.proxy;

import java.util.Random;

import mce.lu.client.render.entity.RenderChromaCow;
import mce.lu.client.render.entity.RenderObsidianBoat;
import mce.lu.common.core.proxy.CommonProxy;
import mce.lu.common.entity.EntityObsidianBoat;
import mce.lu.common.entity.passive.EntityChromaCow;
import mce.lu.common.event.trigger.CondenserTrigger;
import mce.lu.common.event.trigger.ModTriggers;
import mce.lu.common.util.References;
import net.minecraft.client.particle.Particle;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.xendric.xenlib.client.util.ParticleManager;

/**
 * Here to properly render/model edible blocks so the mod works for server.
 * (Putting this in the ModelHandler class crashes the game)
 */
public class ClientProxy extends CommonProxy {
	Random rand;

	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		RenderingRegistry.registerEntityRenderingHandler(EntityObsidianBoat.class, RenderObsidianBoat::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityChromaCow.class, RenderChromaCow::new);

		// Advancement Stuff
		ModTriggers.CONDENSE_BLAZE_ROD = (CondenserTrigger) CommonProxy.registerAdvancementTrigger(
				new CondenserTrigger(new ResourceLocation(References.MOD_ID, "condense_blaze_rod")));

		ModTriggers.CONDENSE_ENDER_EYE = (CondenserTrigger) CommonProxy.registerAdvancementTrigger(
				new CondenserTrigger(new ResourceLocation(References.MOD_ID, "condense_ender_eye")));

		ModTriggers.CONDENSE_GHAST_TEAR = (CondenserTrigger) CommonProxy.registerAdvancementTrigger(
				new CondenserTrigger(new ResourceLocation(References.MOD_ID, "condense_ghast_tear")));

		ModTriggers.CONDENSE_NETHER_STAR = (CondenserTrigger) CommonProxy.registerAdvancementTrigger(
				new CondenserTrigger(new ResourceLocation(References.MOD_ID, "condense_nether_star")));
	}

	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	public void spawnParticle(World world, int x, int y, int z, Particle clazz, float f, float g, float h, float i,
			int j, boolean b) {
		ParticleManager.spawnParticle(world, x, y, z, clazz, f, g, h, i, j, b);
	}
}
