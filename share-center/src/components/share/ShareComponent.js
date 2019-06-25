import React from 'react';
import Button from "../reusable/Button";
import Container from "../reusable/Container";
import Heading from "../reusable/Heading";
import Input from "../reusable/Input";
import Label from "../reusable/Label";
import Form from "../reusable/Form";
import GridContainer from "../reusable/GridContainer";
import GridColumn from '../reusable/GridColumn';
import TextArea from "../reusable/TextArea";

const ShareComponent = (props) => {

    const { onChange, onSubmit } = props;
    return (  
        <Container full fullVertical className="share">
            <Heading h3>Share your world!</Heading>
            <Form onSubmit={onSubmit}>
                <GridContainer columns="2">
                <GridColumn column="1">
                    <Label for="title">Title</Label>
                    <Input 
                        type="text" 
                        name="title" 
                        id="title"
                        placeholder="Enter title" 
                        onChange={onChange}
                        required/>
                    <Label for="description">Description</Label>
                    <Input 
                        label="Description" 
                        type="text" 
                        name="description" 
                        id="description" 
                        placeholder="Enter description" 
                        onChange={onChange}
                    />                        
                </GridColumn>
                <GridColumn column="2">
                    <Label for="comment">Comment </Label>
                    <div>
                        <TextArea
                            cols="100"
                            name="comment" 
                            id="comment"
                            placeholder="Comment if you need to" 
                            onChange={onChange}
                        />
                    </div>
                    
                </GridColumn>
                </GridContainer>
                    <Button>Submit</Button>
            </Form>
        </Container>
)
}

export default ShareComponent;