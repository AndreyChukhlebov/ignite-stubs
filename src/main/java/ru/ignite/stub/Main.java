package ru.ignite.stub;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCheckedException;
import org.apache.ignite.IgniteCondition;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.internal.IgnitionEx;
import org.apache.ignite.internal.processors.resource.GridSpringResourceContext;
import org.apache.ignite.lang.IgniteBiTuple;

import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IgniteCheckedException {
        IgniteBiTuple<Collection<IgniteConfiguration>, ? extends GridSpringResourceContext> config = IgnitionEx.loadConfigurations("config-file.xml");
        Ignition.getOrStart((IgniteConfiguration) config.get1().toArray()[0]);
    }
}