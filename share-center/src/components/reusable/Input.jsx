import styled from 'styled-components';

const Input =  styled.input`
    padding: 0.5em;
    margin: 0.5em;
    color: grey;
    color: ${props => props.inputColor || "violetgreen"};
    background: #eeeeee;
    border: none;
    border-radius: 3px; 
    width: 100%;   
`
export default Input;