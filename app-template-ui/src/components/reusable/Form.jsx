import React, { Component } from 'react';
import styled, { css } from 'styled-components';

const StyledForm = styled.form`
    display: grid;
    padding = '15px';
    margin: ${props => (props.noMargin ? 0 : '15px')};
    `

class Form extends Component {
    render(){
        const { noMargin, ...props } = this.props;
        return <StyledForm 
            noMargin={noMargin} 
            {...props}/>
    }
}

export default Form;