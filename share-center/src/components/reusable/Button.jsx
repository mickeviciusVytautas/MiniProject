import React from 'react'
import styled, { css } from 'styled-components'
import Loader from './Loader'

const StyledButton = styled.button`
    border-radius: 5px;
    background-color: ${props => (props.secondary ? '#808f87' : props.simple ? '#555555' : '#a1cdf1')};
    color: #fff;
    padding: ${props => props.simple ? '5px':'10px 15px'};
    font-size: ${props => {
        if (props.big) return '20px'
        if(props.simple) return '14px'
        return '16px'
    }};
    outline: none;
    border: none;
    cursor: pointer;
    margin: ${props => props.simple ? '5px 10px': '15px auto'};
    border: 2px solid ${props => (props.secondary ? '#808f87' : props.simple ? '#55555' : '#a1cdf1')};
    ${props => {
        return (
            props.inverse &&
            css`
                background-color: #fff;
                color: #a1cdf1;
            `
        )
    }};
    width: 50%;
    display: ${props => props.none ? 'none': ''}
`

const Button = ({ secondary, big, inverse, loading, children, none, ...props }) => {
    return (
        <StyledButton secondary={secondary} big={big} inverse={inverse} none={none} {...props}>
            {loading ? <Loader small white /> : children}
        </StyledButton>
    )
}

export default Button