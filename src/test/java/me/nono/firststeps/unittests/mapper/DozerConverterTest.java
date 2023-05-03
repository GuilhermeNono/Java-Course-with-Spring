package me.nono.firststeps.unittests.mapper;

import me.nono.firststeps.data.vo.v1.PersonVO;
import me.nono.firststeps.mapper.DozerMapper;
import me.nono.firststeps.models.Person;
import me.nono.firststeps.unittests.mapper.mocks.MockPerson;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class DozerConverterTest {
//
//    MockPerson inputObject;
//
//    @Before
//    public void setUp() {
//        inputObject = new MockPerson();
//    }
//
//    @Test
//    public void parseEntityToVOTest() {
//        PersonVO output = DozerMapper.parseObject(inputObject.mockEntity(), PersonVO.class);
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(0L)), output.getId());
//        Assert.assertEquals("First Name Test0", output.getFirstName());
//        Assert.assertEquals("Last Name Test0", output.getLastName());
//        Assert.assertEquals("Addres Test0", output.getAddress());
//        Assert.assertEquals("Male", output.getGender());
//    }
//
//    @Test
//    public void parseEntityListToVOListTest() {
//        List<PersonVO> outputList = DozerMapper.parseListObjects(inputObject.mockEntityList(), PersonVO.class);
//        PersonVO outputZero = outputList.get(0);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(0L)), outputZero.getId());
//        Assert.assertEquals("First Name Test0", outputZero.getFirstName());
//        Assert.assertEquals("Last Name Test0", outputZero.getLastName());
//        Assert.assertEquals("Addres Test0", outputZero.getAddress());
//        Assert.assertEquals("Male", outputZero.getGender());
//
//        PersonVO outputSeven = outputList.get(7);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(7L)), outputSeven.getId());
//        Assert.assertEquals("First Name Test7", outputSeven.getFirstName());
//        Assert.assertEquals("Last Name Test7", outputSeven.getLastName());
//        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
//        Assert.assertEquals("Female", outputSeven.getGender());
//
//        PersonVO outputTwelve = outputList.get(12);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(12L)), outputTwelve.getId());
//        Assert.assertEquals("First Name Test12", outputTwelve.getFirstName());
//        Assert.assertEquals("Last Name Test12", outputTwelve.getLastName());
//        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
//        Assert.assertEquals("Male", outputTwelve.getGender());
//    }
//
//    @Test
//    public void parseVOToEntityTest() {
//        Person output = DozerMapper.parseObject(inputObject.mockVO(), Person.class);
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(0L)), output.getId());
//        Assert.assertEquals("First Name Test0", output.getFirstName());
//        Assert.assertEquals("Last Name Test0", output.getLastName());
//        Assert.assertEquals("Addres Test0", output.getAddress());
//        Assert.assertEquals("Male", output.getGender());
//    }
//
//    @Test
//    public void parserVOListToEntityListTest() {
//        List<Person> outputList = DozerMapper.parseListObjects(inputObject.mockVOList(), Person.class);
//        Person outputZero = outputList.get(0);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(0L)), outputZero.getId());
//        Assert.assertEquals("First Name Test0", outputZero.getFirstName());
//        Assert.assertEquals("Last Name Test0", outputZero.getLastName());
//        Assert.assertEquals("Addres Test0", outputZero.getAddress());
//        Assert.assertEquals("Male", outputZero.getGender());
//
//        Person outputSeven = outputList.get(7);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(7L)), outputSeven.getId());
//        Assert.assertEquals("First Name Test7", outputSeven.getFirstName());
//        Assert.assertEquals("Last Name Test7", outputSeven.getLastName());
//        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
//        Assert.assertEquals("Female", outputSeven.getGender());
//
//        Person outputTwelve = outputList.get(12);
//
//        Assert.assertEquals(Optional.ofNullable(Long.valueOf(12L)), outputTwelve.getId());
//        Assert.assertEquals("First Name Test12", outputTwelve.getFirstName());
//        Assert.assertEquals("Last Name Test12", outputTwelve.getLastName());
//        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
//        Assert.assertEquals("Male", outputTwelve.getGender());
//    }
}