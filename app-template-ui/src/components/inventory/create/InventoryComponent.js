import React from 'react';
import Button from "../../reusable/Button";
import Container from "../../reusable/Container";
import Heading from "../../reusable/Heading";
import Input from "../../reusable/Input";
import Label from "../../reusable/Label";
import Form from "../../reusable/Form";
import GridContainer from "../../reusable/GridContainer";
import GridColumn from '../../reusable/GridColumn';

const InventoryComponent = (props) => {

    const { onChange, onSubmit, type, id } = props;

    return (  
        <Container full fullVertical className="share">
            <Heading h3>Create an inventory for client Id #{id} </Heading>
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
                    <Label for="weight">Weight</Label>
                    <Input 
                        label="weight" 
                        type="number" 
                        name="weight" 
                        id="weight" 
                        placeholder="Enter weight" 
                        onChange={onChange}
                    />      
                           
                </GridColumn>
                <GridColumn column="2">
                <Label for="creationDate">Inventory date</Label>
                    <Input 
                        label="creationDate" 
                        type="date" 
                        name="creationDate" 
                        id="creationDate" 
                        placeholder="Enter creationDate" 
                        onChange={onChange}
                    />                 
                <Label for="sectorNumber">Sector number</Label>
                <Input 
                    label="sectorNumber" 
                    type="number" 
                    name="sectorNumber" 
                    id="sectorNumber" 
                    placeholder="Enter sector number" 
                    onChange={onChange}
                    min="1"
                    max="40"
                />     
                </GridColumn>
                </GridContainer>
                    <Button>Submit</Button>
            </Form>
        </Container>
    )
}

export default InventoryComponent;