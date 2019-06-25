import React from 'react';
import Container from '../reusable/Container';
import styled from 'styled-components';

const StyledFooter = styled.footer`
    text-transform: uppercase;
    font-size: 10px;
    font-weight: bold;
    font-family: sans-serif;
    background-color: #eeeeee;
    color: dark;
    margin-top: 14px;
    margin-bottom: 0px;
`
const Footer = () => {
    return <StyledFooter><Container center small>Trophy <sup>&reg;</sup></Container></StyledFooter>

}

export default Footer;