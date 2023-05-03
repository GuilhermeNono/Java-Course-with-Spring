package me.nono.firststeps.mapper;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class DozerMapper {
    private static final ModelMapper mapper = new ModelMapper();

    public static <O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }

    public static <O, D> List<D> parseListObjects(List<O> origins, Class<D> destination) {

        List<D> destinationObjects = new ArrayList<>();

        for (O o: origins) {
            destinationObjects.add(mapper.map(o, destination));
        }

        return destinationObjects;
    }
}
