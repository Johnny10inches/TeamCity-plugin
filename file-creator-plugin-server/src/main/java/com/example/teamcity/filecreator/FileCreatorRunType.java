package com.example.teamcity.filecreator;

import jetbrains.buildServer.serverSide.RunType;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class FileCreatorRunType extends RunType {

    public FileCreatorRunType(@NotNull final RunTypeRegistry runTypeRegistry) {
        runTypeRegistry.registerRunType(this);
    }

    @NotNull
    @Override
    public String getType() {
        return "fileCreator";
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "File Creator";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Creates a file in the specified project directory.";
    }

    @Nullable
    @Override
    public String getEditRunnerParamsJspFilePath() {
        return "buildServerResources/editFileCreatorRunner.jsp";
    }

    @Nullable
    @Override
    public String getViewRunnerParamsJspFilePath() {
        return "buildServerResources/viewFileCreatorRunner.jsp";
    }

    @NotNull
    @Override
    public Map<String, String> getDefaultRunnerProperties() {
        return new HashMap<>();
    }
}
