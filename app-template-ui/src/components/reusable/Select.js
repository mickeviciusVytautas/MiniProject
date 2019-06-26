import styled from 'styled-components';

const Select =  styled.select`
    padding: 0.5em;
    margin: 0.5em;
    color: grey;
    color: ${props => props.selectColor || "violetgreen"};
    background: #eeeeee;
    border: none;
    border-radius: 3px; 
    width: 100%;   
`
export default Select;