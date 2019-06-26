import React from 'react';
import Button from "../../reusable/Button";
import Container from "../../reusable/Container";
import Heading from "../../reusable/Heading";
import Input from "../../reusable/Input";
import Label from "../../reusable/Label";
import Form from "../../reusable/Form";
import GridContainer from "../../reusable/GridContainer";
import GridColumn from '../../reusable/GridColumn';
import Select from "../../reusable/Select";

const InventoryComponent = (props) => {

    const { onChange, onSubmit, type } = props;

    return (  
        <Container full fullVertical className="share">
            <Heading h3>Create an inventory for client Id #{'a'} </Heading>
            <Form onSubmit={onSubmit}>
                <GridContainer columns="2">
                <GridColumn column="1">
                    <Label for="name">Name</Label>
                    <Input 
                        type="text" 
                        name="name" 
                        id="name"
                        placeholder="Enter name" 
                        onChange={onChange}
                        required/>
                    <Label for="surname">Surname</Label>
                    <Input 
                        label="surname" 
                        type="text" 
                        name="surname" 
                        id="surname" 
                        placeholder="Enter surname" 
                        onChange={onChange}
                    />      
                    <Label for="birthDate">Birth date</Label>
                    <Input 
                        label="birthDate" 
                        type="date" 
                        name="birthDate" 
                        id="birthDate" 
                        placeholder="Enter birthDate" 
                        onChange={onChange}
                    />                        
                </GridColumn>
                <GridColumn column="2">
                <Label for="number">Phone number</Label>
                <Input 
                    label="number" 
                    type="text" 
                    name="number" 
                    id="number" 
                    placeholder="Enter phone number" 
                    onChange={onChange}
                />     
                <Label for="type">Client type</Label>
                <Select onChange={onChange} name="type" value={type}>
                    <option value="ORDINARY">Ordinary</option>
                    <option value="LOYAL">Loyal</option>
                </Select>
                </GridColumn>
                </GridContainer>
                    <Button>Submit</Button>
            </Form>
        </Container>
    )
}

export default InventoryComponent;