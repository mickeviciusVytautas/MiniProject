import React, { Component } from "react";
import {
    Route,
    HashRouter
} from "react-router-dom";
import Home from "./Home";
import Contact from "./components/traction/Traction";
import Share from "./components/share/ShareContainer";
import Container from "./components/reusable/Container";
import Traction from "./components/traction/Traction";
import Layout from "./components/layout/Layout";

class Main extends Component {
    render() {
        return (
            <HashRouter>
                <Layout>
                    <Container fullVertical backgroundWhite heightStatic>
                        <Route exact path="/" component={Home}/>
                        <Route path="/traction" component={Traction}/>
                        <Route path="/groups" component={Contact}/>
                        <Route path="/share" component={Share}/>
                    </Container>
                </Layout>
            </HashRouter>
        )
    }
}

export default Main;