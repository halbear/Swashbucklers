package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import hal.studios.hpm.network.HpmModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ShipspeedmultiplierprocedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		HpmModVariables.WorldVariables.get(world).shipspeedmultiplier = DoubleArgumentType.getDouble(arguments, "speed");
		HpmModVariables.WorldVariables.get(world).syncData(world);
	}
}
