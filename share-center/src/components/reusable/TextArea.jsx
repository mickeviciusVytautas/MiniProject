import React from 'react';
import styled from 'styled-components';

const StyledTextArea = styled.textarea`
    padding: 0.5em;
    margin: 0.5em;
    color: grey;
    color: ${props => props.inputColor || "violetgreen"};
    background: #eeeeee;
    border: none;
    border-radius: 3px; 
    width: 100%;   
`

const TextArea = (props) => {
    return <StyledTextArea {...props} />
}

export default TextArea;