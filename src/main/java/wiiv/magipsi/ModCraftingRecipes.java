package wiiv.magipsi;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import vazkii.arl.recipe.RecipeHandler;
import vazkii.arl.util.ProxyRegistry;
import vazkii.psi.common.block.base.ModBlocks;
import vazkii.psi.common.item.base.ModItems;

public class ModCraftingRecipes {

	public static void init() {
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.cadAssembler),
				"GWG", "WPW", " G ",
				'G', "ingotGold",
				'W', ProxyRegistry.newStack(Blocks.LOG),
				'P', ProxyRegistry.newStack(Blocks.PISTON));

		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.programmer),
				"WMW", "WDW", "G G",
				'G', "ingotGold",
				'M', ProxyRegistry.newStack(Items.MAP),
				'W', ProxyRegistry.newStack(Blocks.LOG),
				'D', "dustPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 1, 3),
				"SSS", "SIS", "SSS",
				'S', "substanceEbony",
				'I', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 1, 4),
				"SSS", "SIS", "SSS",
				'S', "substanceIvory",
				'I', "ingotPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadAssembly, 1, 0),
				"I  ", "IWI", "  I",
				'I', "ingotIron",
				'W', ProxyRegistry.newStack(Blocks.LOG));
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadAssembly, 1, 1),
				"I  ", "IWI", "  I",
				'I', "ingotGold",
				'W', ProxyRegistry.newStack(Blocks.LOG));
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadAssembly, 1, 2),
				"I  ", "IWI", "  I",
				'I', "ingotPsi",
				'W', ProxyRegistry.newStack(Blocks.LOG));
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadAssembly, 1, 3),
				"I  ", "IWI", "  I",
				'I', "ingotEbonyPsi",
				'W', ProxyRegistry.newStack(Blocks.LOG));
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadAssembly, 1, 4),
				"I  ", "IWI", "  I",
				'I', "ingotIvoryPsi",
				'W', ProxyRegistry.newStack(Blocks.LOG));

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadCore, 1, 0),
				"I  ", "DPD", "  I",
				'I', "ingotIron",
				'D', "dustRedstone",
				'P', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadCore, 1, 1),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustRedstone",
				'P', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadCore, 1, 2),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustGlowstone",
				'P', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadCore, 1, 3),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustRedstone",
				'P', "gemPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadCore, 1, 4),
				"I  ", "DPD", "  I",
				'I', "ingotGold",
				'D', "dustGlowstone",
				'P', "gemPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadSocket, 1, 0),
				"DI", "I ",
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadSocket, 1, 1),
				"DI", "I ",
				'I', "ingotPsi",
				'D', "dustRedstone");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadSocket, 1, 2),
				"DI", "I ",
				'I', "ingotPsi",
				'D', "dustGlowstone");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadSocket, 1, 3),
				"DI", "IG",
				'I', "ingotPsi",
				'G', "gemPsi",
				'D', "dustRedstone");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadSocket, 1, 4),
				"DI", "IG",
				'I', "ingotPsi",
				'G', "gemPsi",
				'D', "dustGlowstone");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadBattery, 1, 0),
				"I", "D", "G",
				'I', "ingotIron",
				'G', "ingotGold",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadBattery, 1, 1),
				"I", "D", "G",
				'I', "ingotIron",
				'G', "ingotGold",
				'D', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadBattery, 1, 2),
				"I", "D", "G",
				'I', "ingotIron",
				'G', "ingotGold",
				'D', "gemPsi");

		String[] dyes = {
				"White", "Orange", "Magenta", "LightBlue", "Yellow", "Lime", "Pink", "Gray", "LightGray", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"
		};
		for(int i = 0; i < 16; i++)
			addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadColorizer, 1, i),
					" D ", "GCG", " I ",
					'I', "ingotIron",
					'G', "blockGlass",
					'C', "dye" + dyes[i],
					'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadColorizer, 1, 16),
				" D ", "GCG", " I ",
				'I', "ingotIron",
				'G', "blockGlass",
				'C', "crystalsPrismarine",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.cadColorizer, 1, 17),
				" D ", "GDG", " I ",
				'I', "ingotIron",
				'G', "blockGlass",
				'D', "dustPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 0),
				"ID",
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 2),
				"AID",
				'A', ProxyRegistry.newStack(Items.ARROW),
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 4),
				"AID",
				'A', ProxyRegistry.newStack(Items.STRING),
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 6),
				"AID",
				'A', "slimeball",
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 6),
				"AID",
				'A', ProxyRegistry.newStack(Items.SNOWBALL),
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 8),
				"AID",
				'A', ProxyRegistry.newStack(Items.GUNPOWDER),
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 10),
				"AID",
				'A', "dustRedstone",
				'I', "ingotIron",
				'D', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellBullet, 1, 12),
				"AID",
				'A', ProxyRegistry.newStack(Blocks.STONE_BUTTON),
				'I', "ingotIron",
				'D', "dustPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.spellDrive),
				"I", "R", "I",
				'I', "ingotPsi",
				'R', "dustRedstone");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalShovel),
				"GP", " I", " I",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalPickaxe),
				"PGP", " I ", " I ",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalAxe),
				"GP", "PI", " I",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalSword),
				"P", "G", "I",
				'P', "ingotPsi",
				'G', "gemPsi",
				'I', "ingotGold");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalExosuitHelmet),
				"GPG", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalExosuitChestplate),
				"P P", "GPG", "PPP",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalExosuitLeggings),
				"GPG", "P P", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.psimetalExosuitBoots),
				"G G", "P P",
				'P', "ingotPsi",
				'G', "gemPsi");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.detonator),
				" B ", "IPI",
				'P', "dustPsi",
				'B', ProxyRegistry.newStack(Blocks.STONE_BUTTON),
				'I', "ingotIron");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.exosuitController),
				"R", "G", "I",
				'R', "dustRedstone",
				'G', "blockGlassColorless",
				'I', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.vectorRuler),
				"D", "I", "I",
				'D', "dustPsi",
				'I', "ingotIron");

		addOreDictRecipe(ProxyRegistry.newStack(ModItems.exosuitSensor, 1, 0),
				" I ", "IMR", " R ",
				'M', "dustGlowstone",
				'I', "ingotPsi",
				'R', "ingotIron");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.exosuitSensor, 1, 1),
				" I ", "IMR", " R ",
				'M', "shardPrismarine",
				'I', "ingotPsi",
				'R', "ingotIron");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.exosuitSensor, 1, 2),
				" I ", "IMR", " R ",
				'M', ProxyRegistry.newStack(Items.FIRE_CHARGE),
				'I', "ingotPsi",
				'R', "ingotIron");
		addOreDictRecipe(ProxyRegistry.newStack(ModItems.exosuitSensor, 1, 3),
				" I ", "IMR", " R ",
				'M', ProxyRegistry.newStack(Items.SPECKLED_MELON),
				'I', "ingotPsi",
				'R', "ingotIron");

		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 0),
				"OOO", "OOO", "OOO",
				'O', "dustPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 1),
				"OOO", "OOO", "OOO",
				'O', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 2),
				"OOO", "OOO", "OOO",
				'O', "gemPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 7),
				"OOO", "OOO", "OOO",
				'O', "ingotEbonyPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 8),
				"OOO", "OOO", "OOO",
				'O', "ingotIvoryPsi");
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 9, 0), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 0));
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 9, 1), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 1));
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 9, 2), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 2));
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 9, 3), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 7));
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModItems.material, 9, 4), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 8));

		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 6, 3),
				" C ", "CIC", " C ",
				'C', "coal",
				'I', "ingotPsi");
		addOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 6, 5),
				" C ", "CIC", " C ",
				'C', "gemQuartz",
				'I', "ingotPsi");	
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 4), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 3), "dustGlowstone");
		addShapelessOreDictRecipe(ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 6), ProxyRegistry.newStack(ModBlocks.psiDecorative, 1, 5), "dustGlowstone");


	}

	private static void addOreDictRecipe(ItemStack output, Object... recipe) {
		RecipeHandler.addOreDictRecipe(output, recipe);
	}

	private static void addShapelessOreDictRecipe(ItemStack output, Object... recipe) {
		RecipeHandler.addShapelessOreDictRecipe(output, recipe);
	}
}
