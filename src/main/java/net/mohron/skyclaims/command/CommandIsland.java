package net.mohron.skyclaims.command;

import net.mohron.skyclaims.SkyClaims;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.text.Text;

public class CommandIsland implements CommandExecutor {

	private static final SkyClaims PLUGIN = SkyClaims.getInstance();

	private static CommandSpec commandSpec = CommandSpec.builder()
			.description(Text.of("SkyClaims Island Command"))
			.child(CommandHelp.commandSpec, "help")
			.child(CommandCreate.commandSpec, "create")
			.child(CommandReset.commandSpec, "reset")
			.child(CommandSetSpawn.commandSpec, "setspawn")
			.executor(new CommandHelp())
			.build();

	public static void register() {
		try {
			Sponge.getCommandManager().register(PLUGIN, commandSpec, "skyclaims","island","is");
			PLUGIN.getLogger().info("Registered command: CommandIsland");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
			PLUGIN.getLogger().error("Failed to register command: CommandIsland");
		}
	}

	public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
		return CommandResult.success();
	}

}
