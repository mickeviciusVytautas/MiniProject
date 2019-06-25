import React, { Component } from "react";
import styled from 'styled-components'

const StyledNavLink = styled.li`
    font-weight: bold;
    text-decoration: none;
    background-color: ${props => props.special ? 'rgb(83, 81, 92)' :''};
    margin-left: ${props => props.center ? 'auto' : ''};
    margin-right: ${props => props.center ? 'auto' : ''};
    border: 0;
    outline: 0;
`


export default class ListItem extends Component {
    
    render(){
        const {inline, primary, secondary, special, center, ...props} = this.props;
        return <StyledNavLink
                inline={inline}
                primary={primary}
                secondary={secondary}
                special={special}
                center={center}
                {...props}
            />

    }
}