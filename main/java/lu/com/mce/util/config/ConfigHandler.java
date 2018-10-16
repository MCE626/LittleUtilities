package lu.com.mce.util.config;

import lu.com.mce.util.References;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Config.Type;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = References.MOD_ID, type = Type.INSTANCE, name = References.NAME)
public class ConfigHandler {
	@Name("saddle")
	@Comment("Should you be able to craft saddles?")
	@RequiresMcRestart
	public static boolean saddleRecipe = true;

	@Name("horse_armors")
	@Comment("Should you be able to craft horse armors?")
	@RequiresMcRestart
	public static boolean horseArmorsRecipe = true;

	@Name("colored_glass")
	@Comment("Should you be able to craft *one* colored glass/glass pane?")
	@RequiresMcRestart
	public static boolean coloredGlassRecipe = true;

	@Name("rotten_flesh")
	@Comment("Should you be able to craft rotten flesh? (Fermented Spider Eye + Meat)")
	@RequiresMcRestart
	public static boolean rottenFleshRecipe = true;

	@Name("blaze_rod")
	@Comment("Should you be able to craft blaze rods from blaze powder?")
	@RequiresMcRestart
	public static boolean blazeRodRecipe = true;

	@Name("bone")
	@Comment("Should you be able to craft bones from bonemeal?")
	@RequiresMcRestart
	public static boolean boneRecipe = true;

	@Name("gravel")
	@Comment("Should you be able to craft gravel? (Flint + Cobblestone)")
	@RequiresMcRestart
	public static boolean gravelRecipe = true;

	@Name("name_tag")
	@Comment("Should you be able to craft name tags?")
	@RequiresMcRestart
	public static boolean nameTagRecipe = true;

	@Name("torch")
	@Comment("Should you be able to craft torches with blaze power?")
	@RequiresMcRestart
	public static boolean blazePowderTorchRecipe = true;

	@Name("cobweb")
	@Comment("Should you be able to craft cobwebs from string?")
	@RequiresMcRestart
	public static boolean cobwebRecipe = true;

	@Name("mossy_stones")
	@Comment("Should you be able to craft mossy stone stuff? (Cobblestone/Stone Bricks/Cobblestone Wall + Vines")
	@RequiresMcRestart
	public static boolean mossyStonesRecipe = true;

	@Name("clay_ball")
	@Comment("Should you be able to craft clay balls from a clay block?")
	@RequiresMcRestart
	public static boolean clayBallRecipe = true;

	@Name("snowball")
	@Comment("Should you be able to craft snowballs from a snow block?")
	@RequiresMcRestart
	public static boolean snowballRecipe = true;

	@Name("glowstone_dust")
	@Comment("Should you be able to craft glowstone dust from a glowstone block?")
	@RequiresMcRestart
	public static boolean glowstoneDustRecipe = true;

	@Mod.EventBusSubscriber(modid = References.MOD_ID)
	public static class Handler {
		@SubscribeEvent
		public void onConfigChangedEvent(OnConfigChangedEvent e) {
			if (e.getModID().equals(References.MOD_ID))
				ConfigManager.sync(References.MOD_ID, Type.INSTANCE);
		}
	}
}