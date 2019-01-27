package mce.lu.common.event;

import mce.lu.common.item.ModItems;
import mce.lu.common.util.config.LUConfigManager;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@EventBusSubscriber
public class DyeEvent {
	@SuppressWarnings("deprecation")
	@SubscribeEvent
	public static void onInteractEvent(PlayerInteractEvent e) {
		BlockPos pos = e.getPos();
		IBlockState state = e.getWorld().getBlockState(pos);
		ItemStack heldItem = e.getEntityPlayer().getHeldItemMainhand();
		Block block = e.getWorld().getBlockState(pos).getBlock();

		String[] dyes = { "Black", "Red", "Green", "Brown", "Blue", "Purple", "Cyan", "LightGray", "Gray", "Pink",
				"Lime", "Yellow", "LightBlue", "Magenta", "Orange", "White" };

		// Dye a block in world.
		if (LUConfigManager.modConfig.modEvents.dyeEvent) {
			for (int i = 0; i < 16; ++i) {
				for (ItemStack stack : OreDictionary.getOres("dye" + dyes[15 - i])) {
					if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem() && block == Blocks.WOOL
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.WOOL.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos, Blocks.WOOL.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem()
							&& (block == Blocks.GLASS || block == Blocks.STAINED_GLASS)
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.STAINED_GLASS.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.STAINED_GLASS.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.SPONGE
							&& block == Blocks.STAINED_GLASS) {
						e.getWorld().setBlockState(pos, Blocks.GLASS.getDefaultState());
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem()
							&& (block == Blocks.GLASS_PANE || block == Blocks.STAINED_GLASS_PANE)
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.STAINED_GLASS_PANE.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.STAINED_GLASS_PANE.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.SPONGE
							&& block == Blocks.STAINED_GLASS_PANE) {
						e.getWorld().setBlockState(pos, Blocks.GLASS_PANE.getDefaultState());
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem()
							&& (block == Blocks.HARDENED_CLAY || block == Blocks.STAINED_HARDENED_CLAY)
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.STAINED_HARDENED_CLAY.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.STAINED_HARDENED_CLAY.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == ModItems.SPONGE
							&& block == Blocks.STAINED_HARDENED_CLAY) {
						e.getWorld().setBlockState(pos, Blocks.HARDENED_CLAY.getDefaultState());
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem() && block == Blocks.CARPET
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.CARPET.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.CARPET.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem() && block == Blocks.CONCRETE
							&& block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.CONCRETE.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.CONCRETE.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					else if (!heldItem.isEmpty() && heldItem.getItem() == stack.getItem()
							&& block == Blocks.CONCRETE_POWDER && block.getMetaFromState(state) != i) {
						if (heldItem.getItem().getHasSubtypes()) {
							if (heldItem.getItemDamage() == 15 - i) {
								e.getWorld().setBlockState(pos,
										Blocks.CONCRETE_POWDER.getBlockState().getBlock().getStateFromMeta(i));
								if (!e.getEntityPlayer().isCreative())
									heldItem.shrink(1);
							}
						} else {
							e.getWorld().setBlockState(pos,
									Blocks.CONCRETE_POWDER.getBlockState().getBlock().getStateFromMeta(i));
							if (!e.getEntityPlayer().isCreative())
								heldItem.shrink(1);
						}
					}

					// Color Bed, but only does 1 part, not both..
					/*
					 * else if (e.getEntityPlayer().isSneaking() &&
					 * !heldItem.isEmpty() && heldItem.getItem() == Items.DYE &&
					 * heldItem.getItemDamage() == 15 - i &&
					 * e.getWorld().getTileEntity(pos) instanceof TileEntityBed
					 * && ((TileEntityBed) te).getColor().getMetadata() != i) {
					 * if(((TileEntityBed)te).isHeadPiece()){ ((TileEntityBed)
					 * te).setColor(EnumDyeColor.byMetadata(i)); } else {
					 * ((TileEntityBed)
					 * te).setColor(EnumDyeColor.byMetadata(i)); }
					 * heldItem.shrink(1); }
					 */
				}
			}
		}
	}
}
